package lox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class NativeFun {

    static class Clock implements LoxCallable{
        @Override
        public int arity() { return 0; }

        @Override
        public Object call(Interpreter interpreter, Object callee, List<Object> arguments) {
        return (double)System.currentTimeMillis() / 1000.0;
    }

        @Override
        public String toString() { return "<native fn>"; }
    }

    static class Println implements LoxCallable{
        @Override
        public int arity() { return 1; }
        @Override
        public Object call(Interpreter interpreter, Object callee, List<Object> arguments) {
            System.out.println(stringify(arguments.getFirst()));
            return arguments.getFirst();
        }

        @Override
        public String toString() { return "<native fn>"; }
    }

    static class Get implements LoxCallable{
        @Override
        public int arity() { return 0; }

        @Override
        public Object call(Interpreter interpreter, Object callee, List<Object> arguments) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                return br.readLine();
            } catch (IOException e) {
                throw new RuntimeError(((Expr.Variable) callee).name,"IOException");
            }
        }

        @Override
        public String toString() { return "<native fn>"; }
    }

    static class Exit implements LoxCallable{
        @Override
        public int arity() { return 0; }

        @Override
        public Object call(Interpreter interpreter, Object callee, List<Object> arguments) {
        System.exit(64);
        return null;
    }

        @Override
        public String toString() { return "<native fn>"; }
    }


    static String stringify(Object object) {
        if (object == null) return "nil";

        if (object instanceof Double) {
            String text = object.toString();
            if (text.endsWith(".0")) {
                text = text.substring(0, text.length() - 2);
            }
            return text;
        }

        return object.toString();
    }
}
