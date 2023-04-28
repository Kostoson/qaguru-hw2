package testswhithfiles.data;
import java.util.List;

public class Inoske {
    private String breed;
    private String name;
    private Integer age;
    private List<String> owners;
    private Boolean isGoodBoy;
    private Appearance appearance;


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getOwners() {
        return owners;
    }

    public Boolean getIsGoodBoy() {
        return isGoodBoy;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public class Appearance {
        public String ears, nose;

        public String getEars() {
            return ears;
        }

        public String getNose() {
            return nose;
        }
    }








}
