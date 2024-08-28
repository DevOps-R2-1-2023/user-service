package uns.ac.rs.user_service.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PasswordUpdateRequest {
    @NotEmpty(message = "Old password is required.")
    private String oldPassword;

    @NotEmpty(message = "New password is required.")
    private String newPassword;

    @NotEmpty(message = "Repeat new password is required.")
    private String repeatNewPassword;
}
