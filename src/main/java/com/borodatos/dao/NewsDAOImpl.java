package com.borodatos.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;
import com.borodatos.model.News;

/**
 * @author Vitali Usik
 *
 */

@Repository
public class NewsDAOImpl implements NewsDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	public void addNews(News news) {
		sessionFactory.getCurrentSession().save(news);
	}

	@SuppressWarnings("unchecked")
	public List<News> listNews() {
		return sessionFactory.getCurrentSession().createQuery("from News")
	            .list();
	}

	public void removeNews(Integer id) {
		News news = (News) sessionFactory.getCurrentSession().load(
                News.class, id);
        if (null != news) {
            sessionFactory.getCurrentSession().delete(news);
        }
	}

}
