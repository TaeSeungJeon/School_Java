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
        DeptDTO dept = null;
        try {
            dept = this.dao.getFindDeptNo(deptno, sqlSession);
        }finally {
            sqlSession.close();
        }
        return dept;
    }

    public void updateDept(DeptDTO dept) {
        SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();

        try {
            this.dao.updateDept(dept, sqlSession);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }

    public void deleteDept(DeptDTO dto) {
        SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();

        try {
            this.dao.deleteDept(dto, sqlSession);
        }finally {
            sqlSession.close();
        }
    }

    public void delAllDept() {
        SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();
        try {
            this.dao.delAllDept(sqlSession);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }
}
