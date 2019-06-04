import com.cai.entity.LeaseUser;
import com.cai.mapper.LeaseUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by caibaolong on 2019/6/4.
 */
public class MainTest {
    public static void main(String[] args) {


    }

    @Test
    public void test1() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        LeaseUserMapper mapper = session.getMapper(LeaseUserMapper.class);

        List<LeaseUser> userInfoList = mapper.list();
        for (LeaseUser u : userInfoList) {
            System.out.println(u.toString());
        }
    }
}
