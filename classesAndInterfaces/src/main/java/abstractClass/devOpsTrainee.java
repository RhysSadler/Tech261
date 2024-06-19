package abstractClass;

public class devOpsTrainee extends JavaTrainee implements Trainable{
    private String experiences;
    private String certifications;
    private String projects;

    public devOpsTrainee(String name, int age, String email, int phone, String experiences, String certifications, String project, String github) {
        super(name, age, email, phone, experiences, certifications, project, github);
        this.experiences = experiences;
        this.certifications = certifications;
        this.projects = project;
    }

    @Override
    public String getExperiences() {
        return experiences;
    }

    @Override
    public void setExperiences(String experiences) {
        this.experiences = experiences;
    }

    @Override
    public String getCertifications() {
        return certifications;
    }

    @Override
    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }
}
