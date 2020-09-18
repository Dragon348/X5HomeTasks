package ru.x5.Task5.pctask;

public class Monitor {
    private double diagonal;
    private MatrixType matrixType;
    private String producer;

    public Monitor(String producer, double diagonal, MatrixType matrixType) {
        this.diagonal = diagonal;
        this.matrixType = matrixType;
        this.producer = producer;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public MatrixType getMatrixType() {
        return matrixType;
    }

    public String getProducer() {
        return producer;
    }

    public String toString() {
        return "Монитор:\n"
                + "Производитель: " + getProducer() + "\n"
                + "Диагоняль: " + getDiagonal() + "\n"
                + "Тип матрицы: " + getMatrixType() + "\n";
    }
}
