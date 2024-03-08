package lox;

public class Token {
    final TokenType type;//type: 表示标记的类型，是一个枚举类型 TokenType 的实例。
    final String lexeme;//lexeme: 表示标记在源代码中的文本形式，即标记的字符串表示。
    final Object literal;//literal: 表示标记的字面量值，可以是任意类型的对象，用于表示标记的具体值。
    final int line;//line: 表示标记在源代码中所在的行号。

    Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}
