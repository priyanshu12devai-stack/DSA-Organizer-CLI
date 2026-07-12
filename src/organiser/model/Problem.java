package organiser.model;

public class Problem {
    private String problemName;
    private String algorithm;
    private String topic;
    private String difficulty;
    private String fileName;
    private String prob_num;

    public Problem() {

    }

    public Problem(String problemName, String algorithm, String topic, String difficulty, String fileName, String prob_num) {
        this.problemName = problemName;
        this.algorithm = algorithm;
        this.topic = topic;
        this.difficulty = difficulty;
        this.fileName = fileName;
        this.prob_num = prob_num;

    }

    //getter
    public String getProblemName() {
        return problemName;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public String getTopic() {
        return topic;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getFileName() {
        return fileName;
    }

    public String getProb_num() {
        return prob_num;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setProb_num(String prob_num) {
        this.prob_num = prob_num;
    }

    @Override
    public String toString() {
        return "Problem{" + "fileName='" + fileName + '\'' + ", problemName='" + problemName + '\'' + ", algorithm='" + algorithm + '\'' + ", topic='" + topic + '\'' + ", difficulty='" + difficulty + '\'' + '}';
    }
}
