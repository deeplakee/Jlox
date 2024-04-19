package lox;

import java.util.List;

interface LoxCallable {
    int arity();

    Object call(Interpreter interpreter, Object callee, List<Object> arguments);
}
