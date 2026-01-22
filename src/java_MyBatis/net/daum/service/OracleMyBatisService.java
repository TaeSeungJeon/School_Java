package java_MyBatis.net.daum.service;

import java_MyBatis.net.daum.config.MyBatisSessionFactory;
import java_MyBatis.net.daum.dao.OracleMyBatisDAO;
import java_MyBatis.net.daum.dto.DeptDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class OracleMyBatisService {

    OracleMyBatisDAO dao;

    public OracleMyBatisService(){
        super();
        dao = new OracleMyBatisDAO();
    }

    public List<DeptDTO> selectAll(){
        List<DeptDTO> dlist = null;
        SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();

        try{
            dlist = dao.selectAll(sqlSession);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return dlist;
    }

    public void insertDept(DeptDTO deptDTO) {
        SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();

        try {
            this.dao.insertDept(deptDTO, sqlSession);
            sqlSession.commit();

        }finally {
            sqlSession.close();
        }
    }


    public DeptDTO getFindDeptNo(int deptno) {
        SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();
        DeptDTO deptDTO = null;
        try {
            deptDTO = this.dao.getFindDeptNo(deptno, sqlSession);
        }finally {
            sqlSession.close();
        }
        return deptDTO;
    }
}
