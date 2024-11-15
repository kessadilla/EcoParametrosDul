package org.juankessoglou.ecoparametrosdul.Model;

import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
public class DatosFormulario {
    @NotBlank //(message = "El campo usuario no puede estar vacío")
    private String usuario;

    @NotBlank(message = "{formulario_validado.clave.NotBlank}")
    @Size(min = 6, max = 20, message = "{formulario_validado.clave.Size}")
    private String clave;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Past(message = "{formulario_validado.fechaNacimento.Past}")
    private LocalDate fechaNacimiento;

    @Min(value = 18, message = "{formulario_validado.edad.Min}")
    @Max(value = 67, message = "{formulario_validado.edad.Max}")
    private Integer edad;

    @Digits(integer = 3, fraction = 2, message = "{formulario_validado.peso.Digits}")
    private Float peso;

    @NotNull(message = "{formulario_validado.generoSeleccionado.NotNull}")
    private String generoSeleccionado;
}
