package uz.cosmos.apptouristbot.entity.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbsNameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nameUz;

    private String nameUzc;

    private String nameRu;

    private String nameEn;

    public AbsNameEntity(String nameUz, String nameUzc, String nameRu, String nameEn) {
        this.nameUz = nameUz;
        this.nameUzc = nameUzc;
        this.nameRu = nameRu;
        this.nameEn = nameEn;
    }
}
