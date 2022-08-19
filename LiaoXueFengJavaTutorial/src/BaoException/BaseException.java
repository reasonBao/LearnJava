package BaoException;

public class BaseException extends RuntimeException{
    public BaseException() {
        super();    // 调用父类的构造方法，父类即RuntimeException
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }
}
