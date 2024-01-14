package org.example.behavioural.command.problem1;

import java.util.ArrayList;
import java.util.List;

/*The invoker class*/
public class TextFIleOperationInvoker {

    private final List<TextFileOperation> operations = new ArrayList<>();

    public String executeOperation(TextFileOperation operation){
        operations.add(operation);
        return operation.execute();
    }
}
