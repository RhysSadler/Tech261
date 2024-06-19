package abstractClass;

public class devOpsTrainee extends Trainee {
    private String experiences;
    private String certifications;
    private String projects;

    public devOpsTrainee(String name, int age, String email, String phone, String experiences, String certifications, String projects) {
        super(name, age, email, phone);
        this.experiences = experiences;
        this.certifications = certifications;
        this.projects = projects;
    }

    public String getExperiences() {
        return experiences;
    }

    public void setExperiences(String experiences) {
        this.experiences = experiences;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    public void train() {
        Trainable.train();
    }

    public void study() {
        Trainable.study();
    }
}
