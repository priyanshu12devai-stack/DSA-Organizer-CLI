package organiser.model;

public class Problem {
    private String problemName;
    private String algorithm;
    private String topic;
    private String difficulty;
    private String fileName;
    private String problemNumber;

    public Problem() {

    }

    public Problem(String problemName, String algorithm, String topic, String difficulty, String fileName, String problemNumber) {
        this.problemName = problemName;
        this.algorithm = algorithm;
        this.topic = topic;
        this.difficulty = difficulty;
        this.fileName = fileName;
        this.problemNumber = problemNumber;

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

    public String getProblemNumber() {
        return problemNumber;
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

    public void setProblemNumber(String problemNumber) {
        this.problemNumber = problemNumber;
    }

    @Override
    public String toString() {
        return "Problem{" + "fileName='" + fileName + '\'' + ", problemName='" + problemName + '\'' + ", algorithm='" + algorithm + '\'' + ", topic='" + topic + '\'' + ", difficulty='" + difficulty + '\'' + ", Number='" + problemNumber + '\''+'}';
    }
}
