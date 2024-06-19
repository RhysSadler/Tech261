package abstractClass;

public class JavaTrainee extends Trainee implements Trainable{
    private String experiences;
    private String certifications;
    private String project;
    private String github;

    public JavaTrainee(String name, int age, String email, String phone, String experiences, String certifications, String project, String github) {
        super(name, age, email, phone);
        this.experiences = experiences;
        this.certifications = certifications;
        this.project = project;
        this.github = github;
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

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    @Override
    public void train() {
        Trainable.super.train();
    }

    @Override
    public void study() {
        System.out.println("JavaTrainee is studying");
    }


}
