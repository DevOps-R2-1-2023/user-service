package uns.ac.rs.user_service.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uns.ac.rs.user_service.model.Role;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationRequest {
    @NotEmpty(message = "Username is required.")
    private String username;

    @NotEmpty(message = "Email address is required.")
    @Email(message = "Invalid email address format.")
    private String emailAddress;

    @NotEmpty(message = "Password is required.")
    private String password;

    @NotEmpty(message = "Password is required.")
    private String repeatPassword;

    @NotEmpty(message = "First name is required.")
    private String firstName;

    @NotEmpty(message = "Last name is required.")
    private String lastName;

    @Builder.Default
    @NotNull(message = "Role is required.")
    private Role role = Role.GUEST;
}
