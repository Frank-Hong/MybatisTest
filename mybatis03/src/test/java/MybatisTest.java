import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MybatisTest {
    @Test
    public void testSelectUserById() {
        SqlSession session = MybatisUtils.getSession();  //获取SqlSession连接
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectUserById(1);
        System.out.println(user);
        session.close();
    }



}
