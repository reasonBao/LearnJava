package BaoException;

public class Main
{

    public static void main(String[] args)
    {
        String token = login("admin", "pass");
        System.out.println("Token: " + token);
    }

    static String login(String username, String password)
    {
        // 若用户名为admin
        if (username.equals("admin"))
        {
            // 若密码为password
            if (password.equals("password"))
            {
                return "登录成功！";    // 返回xx标记
            }
            // 若密码不是password，则登录失败，抛出登录失败异常
            else
            {
                // 抛出LoginFailedException:
                throw new LoginFailedException("Bad username or password.");
            }
        }
        // 用户名不是user 则抛出用户名未找到异常
        else
        {
            // 抛出UserNotFoundException:
            throw new UserNotFoundException("User not found.");
        }
    }
}
