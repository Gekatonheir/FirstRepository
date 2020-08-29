package Day6;

public class Professor {
    private String fio;
    private String subject;
    public Professor(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }
    public String getFio() {
        return fio;
    }
    public String getSubject() {
        return subject;
    }
    public void checkWork(Student x){
        int score = (int)(Math.random()*4+2);
        String rating;
        switch (score){
            case 2: rating = "Неудовлетворительно";
                break;
            case 3: rating = "Удовлетворительно";
                break;
            case 4: rating = "Хорошо";
                break;
            case 5: rating = "Отлично";
                break;
            default:
                rating = "error";
        }
        System.out.println("Преподаватель "+fio+ " оценил "+"студента с именем "+x.getFio()+"по предмету "+ subject+" на оценку "+ rating);
    }
}
