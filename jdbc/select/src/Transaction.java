import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 描述:事务管理  实现张三给李四转账   用事务实现  如果不用事务可能出现
 * 张三转账成功 但李四未收到账
 */
public class Transaction {
    public static void main(String[] args)  {
        //从张三的账户减少100
        String sql1 = "UPDATE money SET balance = balance-100 WHERE name = \"张三\"";
        //从李四的账户增加100
        String sql2 = "UPDATE money SET balance = balance+100 WHERE name=\"李四\";";

        //获取连接
        Connection conn = DbUtil.getConn();
        //获取发射器
        PreparedStatement pstat1 = DbUtil.getPrStat(conn,sql1);
        PreparedStatement pstat2 = DbUtil.getPrStat(conn,sql2);

        try {
            conn.setAutoCommit(false);//将自动提交事务改为手动提交
            int i = pstat1.executeUpdate();//sql语句执行成功返回1  失败返回0
            int j = pstat2.executeUpdate();

            if (i==1 && j == 1) {
                conn.commit();//事务提交
                System.out.println("执行成功！");
            }else {
                conn.rollback();//事务回滚
                System.out.println("执行失败！");
            }
        } catch (SQLException e) {
            try {
                conn.rollback();//事务回滚
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            DbUtil.close(null,pstat2,null);
            DbUtil.close(null,pstat1,conn);
        }
    }
}
