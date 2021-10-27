package privacy.registration.payload.request;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/** Constructs the sign up request that is sent to the server **/
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    String role;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

    public void setEmail(@NotBlank
                         @Size(max = 50)
                         @Email String email){
        this.email = email + "@pm.com";
    }

    public void setUsername(@NotBlank @Size(min = 3, max = 20) String username) {
        this.username = username;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPassword(@NotBlank @Size(min = 6, max = 40) String password) {
        this.password = password;
    }
}