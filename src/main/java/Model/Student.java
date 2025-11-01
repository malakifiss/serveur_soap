package Model;

import enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String nom;
    private String prenom;
    private Genre genre;

}