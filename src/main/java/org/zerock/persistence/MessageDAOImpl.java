package org.zerock.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MessageVO;

import javax.inject.Inject;

@Repository
public class MessageDAOImpl implements MessageDAO {

    @Inject
    private SqlSession session;

    private static String namespace = "org.zerock.mapper.messageMapper";


    @Override
    public void create(MessageVO vo) throws Exception {
        session.insert(namespace+".create",vo);
    }

    @Override
    public MessageVO readMessage(Integer mid) throws Exception {
        return session.selectOne(namespace+".readMessage", mid);
    }

    @Override
    public void updateState(Integer mid) throws Exception {
        session.update(namespace+".updateState", mid);

    }
}
