package serveur;

import Model.Student;
import enums.Genre;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName = "studentService")
public class EtudiantWService {
    @WebMethod(operationName = "getEtudiants")
    public List<Student> listEtudiants(){
        return List.of(new Student(1,"nom1","prenom1", Genre.FEMME),
                new Student(2,"nom2","prenom2", Genre.HOMME),
                new Student(3,"nom3","prenom3", Genre.FEMME));
    }
};