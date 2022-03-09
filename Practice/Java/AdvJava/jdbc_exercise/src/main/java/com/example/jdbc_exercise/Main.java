package com.example.jdbc_exercise;

import java.sql.SQLTransientException;

public class Main {
    public static void main(String[] args) throws SQLTransientException {
        ConcreteSuperClass concreteSuperClass = new ConcreteSuperClass();
        concreteSuperClass.connect();
        concreteSuperClass.closeCon();
    }
}
