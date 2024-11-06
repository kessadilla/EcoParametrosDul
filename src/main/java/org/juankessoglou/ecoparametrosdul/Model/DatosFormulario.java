package org.juankessoglou.ecoparametrosdul.Model;

import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
public class DatosFormulario {
    @NotBlank(message = "El campo usuario no puede estar vacío") private String nombre;

    @NotBlank @Size(min = 6, max = 20,
        message = "La contraseña debe tener entre 6 y 20 caracteres") private String clave;

    @Past private LocalDate fechaNacimiento;

    @Min(18)@Max(67) private Integer edad;

    @Digits(integer = 3, fraction = 2) private Float peso;

    @NotNull private String generoSeleccionado;
}
