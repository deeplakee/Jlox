package lox;

public enum TokenType {

    // 运算符号（Operator notation）
    LEFT_PAREN,   //左括号 (，用于表示代码中的分组或函数调用。
    RIGHT_PAREN,  //右括号 )，用于表示代码中的分组或函数调用。
    LEFT_BRACE,   //左花括号 {，用于表示代码中的代码块的开始。
    RIGHT_BRACE,  //右花括号 }，用于表示代码中的代码块的结束。
    COMMA,        //逗号 ,，用于分隔函数参数或数组元素等。
    DOT,          //点 .，用于访问对象的属性或方法。
    MINUS,        //减号 -，用于表示减法操作。
    PLUS,         //加号 +，用于表示加法操作。
    MOD,          //百分号 %，用于表示取模操作。
    SEMICOLON,    //分号 ;，用于表示语句的结束。
    SLASH,        //斜杠 /，用于表示除法操作。
    STAR,         //星号 *，用于表示乘法操作。
    BANG,         //单个感叹号 !，用于表示逻辑非操作。
    BANG_EQUAL,   //双感叹号 !=，用于表示不等于比较操作。
    EQUAL,        //单个等号 =，用于赋值操作。
    EQUAL_EQUAL,  //双等号 ==，用于相等比较操作。
    GREATER,      // 大于号 >，用于大于比较操作。
    GREATER_EQUAL,//大于等于号 >=，用于大于等于比较操作。
    LESS,         // 小于号 <，用于小于比较操作。
    LESS_EQUAL,   //小于等于号 <=，用于小于等于比较操作。


    // 字面量（Literals）
    IDENTIFIER,   //标识符，用于表示变量名、函数名等。
    STRING,       //字符串字面量，表示一串文本。
    NUMBER,       //数字字面量，表示数值。


    // 关键字（Keywords）
    AND,
    CLASS,
    ELSE,
    FALSE,
    FUN,
    FOR,
    IF,
    NIL,
    OR,
    RETURN,
    SUPER,
    THIS,
    TRUE,
    VAR,
    WHILE,
    BREAK,
    CONTINUE,


    // 文件结束标记（EOF）
    EOF// 表示已经到达代码文件的末尾，用于解析器或编译器判断是否已经处理完所有的代码。
}