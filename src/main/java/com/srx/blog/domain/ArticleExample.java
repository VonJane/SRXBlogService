package com.srx.blog.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleContentIsNull() {
            addCriterion("article_content is null");
            return (Criteria) this;
        }

        public Criteria andArticleContentIsNotNull() {
            addCriterion("article_content is not null");
            return (Criteria) this;
        }

        public Criteria andArticleContentEqualTo(String value) {
            addCriterion("article_content =", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotEqualTo(String value) {
            addCriterion("article_content <>", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentGreaterThan(String value) {
            addCriterion("article_content >", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentGreaterThanOrEqualTo(String value) {
            addCriterion("article_content >=", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentLessThan(String value) {
            addCriterion("article_content <", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentLessThanOrEqualTo(String value) {
            addCriterion("article_content <=", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentLike(String value) {
            addCriterion("article_content like", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotLike(String value) {
            addCriterion("article_content not like", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentIn(List<String> values) {
            addCriterion("article_content in", values, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotIn(List<String> values) {
            addCriterion("article_content not in", values, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentBetween(String value1, String value2) {
            addCriterion("article_content between", value1, value2, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotBetween(String value1, String value2) {
            addCriterion("article_content not between", value1, value2, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentShortIsNull() {
            addCriterion("article_content_short is null");
            return (Criteria) this;
        }

        public Criteria andArticleContentShortIsNotNull() {
            addCriterion("article_content_short is not null");
            return (Criteria) this;
        }

        public Criteria andArticleContentShortEqualTo(String value) {
            addCriterion("article_content_short =", value, "articleContentShort");
            return (Criteria) this;
        }

        public Criteria andArticleContentShortNotEqualTo(String value) {
            addCriterion("article_content_short <>", value, "articleContentShort");
            return (Criteria) this;
        }

        public Criteria andArticleContentShortGreaterThan(String value) {
            addCriterion("article_content_short >", value, "articleContentShort");
            return (Criteria) this;
        }

        public Criteria andArticleContentShortGreaterThanOrEqualTo(String value) {
            addCriterion("article_content_short >=", value, "articleContentShort");
            return (Criteria) this;
        }

        public Criteria andArticleContentShortLessThan(String value) {
            addCriterion("article_content_short <", value, "articleContentShort");
            return (Criteria) this;
        }

        public Criteria andArticleContentShortLessThanOrEqualTo(String value) {
            addCriterion("article_content_short <=", value, "articleContentShort");
            return (Criteria) this;
        }

        public Criteria andArticleContentShortLike(String value) {
            addCriterion("article_content_short like", value, "articleContentShort");
            return (Criteria) this;
        }

        public Criteria andArticleContentShortNotLike(String value) {
            addCriterion("article_content_short not like", value, "articleContentShort");
            return (Criteria) this;
        }

        public Criteria andArticleContentShortIn(List<String> values) {
            addCriterion("article_content_short in", values, "articleContentShort");
            return (Criteria) this;
        }

        public Criteria andArticleContentShortNotIn(List<String> values) {
            addCriterion("article_content_short not in", values, "articleContentShort");
            return (Criteria) this;
        }

        public Criteria andArticleContentShortBetween(String value1, String value2) {
            addCriterion("article_content_short between", value1, value2, "articleContentShort");
            return (Criteria) this;
        }

        public Criteria andArticleContentShortNotBetween(String value1, String value2) {
            addCriterion("article_content_short not between", value1, value2, "articleContentShort");
            return (Criteria) this;
        }

        public Criteria andArticleSourceUriIsNull() {
            addCriterion("article_source_uri is null");
            return (Criteria) this;
        }

        public Criteria andArticleSourceUriIsNotNull() {
            addCriterion("article_source_uri is not null");
            return (Criteria) this;
        }

        public Criteria andArticleSourceUriEqualTo(String value) {
            addCriterion("article_source_uri =", value, "articleSourceUri");
            return (Criteria) this;
        }

        public Criteria andArticleSourceUriNotEqualTo(String value) {
            addCriterion("article_source_uri <>", value, "articleSourceUri");
            return (Criteria) this;
        }

        public Criteria andArticleSourceUriGreaterThan(String value) {
            addCriterion("article_source_uri >", value, "articleSourceUri");
            return (Criteria) this;
        }

        public Criteria andArticleSourceUriGreaterThanOrEqualTo(String value) {
            addCriterion("article_source_uri >=", value, "articleSourceUri");
            return (Criteria) this;
        }

        public Criteria andArticleSourceUriLessThan(String value) {
            addCriterion("article_source_uri <", value, "articleSourceUri");
            return (Criteria) this;
        }

        public Criteria andArticleSourceUriLessThanOrEqualTo(String value) {
            addCriterion("article_source_uri <=", value, "articleSourceUri");
            return (Criteria) this;
        }

        public Criteria andArticleSourceUriLike(String value) {
            addCriterion("article_source_uri like", value, "articleSourceUri");
            return (Criteria) this;
        }

        public Criteria andArticleSourceUriNotLike(String value) {
            addCriterion("article_source_uri not like", value, "articleSourceUri");
            return (Criteria) this;
        }

        public Criteria andArticleSourceUriIn(List<String> values) {
            addCriterion("article_source_uri in", values, "articleSourceUri");
            return (Criteria) this;
        }

        public Criteria andArticleSourceUriNotIn(List<String> values) {
            addCriterion("article_source_uri not in", values, "articleSourceUri");
            return (Criteria) this;
        }

        public Criteria andArticleSourceUriBetween(String value1, String value2) {
            addCriterion("article_source_uri between", value1, value2, "articleSourceUri");
            return (Criteria) this;
        }

        public Criteria andArticleSourceUriNotBetween(String value1, String value2) {
            addCriterion("article_source_uri not between", value1, value2, "articleSourceUri");
            return (Criteria) this;
        }

        public Criteria andIstopIsNull() {
            addCriterion("isTop is null");
            return (Criteria) this;
        }

        public Criteria andIstopIsNotNull() {
            addCriterion("isTop is not null");
            return (Criteria) this;
        }

        public Criteria andIstopEqualTo(Integer value) {
            addCriterion("isTop =", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotEqualTo(Integer value) {
            addCriterion("isTop <>", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThan(Integer value) {
            addCriterion("isTop >", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("isTop >=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThan(Integer value) {
            addCriterion("isTop <", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThanOrEqualTo(Integer value) {
            addCriterion("isTop <=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopIn(List<Integer> values) {
            addCriterion("isTop in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotIn(List<Integer> values) {
            addCriterion("isTop not in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopBetween(Integer value1, Integer value2) {
            addCriterion("isTop between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotBetween(Integer value1, Integer value2) {
            addCriterion("isTop not between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andHascommentIsNull() {
            addCriterion("hasComment is null");
            return (Criteria) this;
        }

        public Criteria andHascommentIsNotNull() {
            addCriterion("hasComment is not null");
            return (Criteria) this;
        }

        public Criteria andHascommentEqualTo(Integer value) {
            addCriterion("hasComment =", value, "hascomment");
            return (Criteria) this;
        }

        public Criteria andHascommentNotEqualTo(Integer value) {
            addCriterion("hasComment <>", value, "hascomment");
            return (Criteria) this;
        }

        public Criteria andHascommentGreaterThan(Integer value) {
            addCriterion("hasComment >", value, "hascomment");
            return (Criteria) this;
        }

        public Criteria andHascommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("hasComment >=", value, "hascomment");
            return (Criteria) this;
        }

        public Criteria andHascommentLessThan(Integer value) {
            addCriterion("hasComment <", value, "hascomment");
            return (Criteria) this;
        }

        public Criteria andHascommentLessThanOrEqualTo(Integer value) {
            addCriterion("hasComment <=", value, "hascomment");
            return (Criteria) this;
        }

        public Criteria andHascommentIn(List<Integer> values) {
            addCriterion("hasComment in", values, "hascomment");
            return (Criteria) this;
        }

        public Criteria andHascommentNotIn(List<Integer> values) {
            addCriterion("hasComment not in", values, "hascomment");
            return (Criteria) this;
        }

        public Criteria andHascommentBetween(Integer value1, Integer value2) {
            addCriterion("hasComment between", value1, value2, "hascomment");
            return (Criteria) this;
        }

        public Criteria andHascommentNotBetween(Integer value1, Integer value2) {
            addCriterion("hasComment not between", value1, value2, "hascomment");
            return (Criteria) this;
        }

        public Criteria andArticleCategoryIdIsNull() {
            addCriterion("article_category_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleCategoryIdIsNotNull() {
            addCriterion("article_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCategoryIdEqualTo(Long value) {
            addCriterion("article_category_id =", value, "articleCategoryId");
            return (Criteria) this;
        }

        public Criteria andArticleCategoryIdNotEqualTo(Long value) {
            addCriterion("article_category_id <>", value, "articleCategoryId");
            return (Criteria) this;
        }

        public Criteria andArticleCategoryIdGreaterThan(Long value) {
            addCriterion("article_category_id >", value, "articleCategoryId");
            return (Criteria) this;
        }

        public Criteria andArticleCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("article_category_id >=", value, "articleCategoryId");
            return (Criteria) this;
        }

        public Criteria andArticleCategoryIdLessThan(Long value) {
            addCriterion("article_category_id <", value, "articleCategoryId");
            return (Criteria) this;
        }

        public Criteria andArticleCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("article_category_id <=", value, "articleCategoryId");
            return (Criteria) this;
        }

        public Criteria andArticleCategoryIdIn(List<Long> values) {
            addCriterion("article_category_id in", values, "articleCategoryId");
            return (Criteria) this;
        }

        public Criteria andArticleCategoryIdNotIn(List<Long> values) {
            addCriterion("article_category_id not in", values, "articleCategoryId");
            return (Criteria) this;
        }

        public Criteria andArticleCategoryIdBetween(Long value1, Long value2) {
            addCriterion("article_category_id between", value1, value2, "articleCategoryId");
            return (Criteria) this;
        }

        public Criteria andArticleCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("article_category_id not between", value1, value2, "articleCategoryId");
            return (Criteria) this;
        }

        public Criteria andImportanceIsNull() {
            addCriterion("importance is null");
            return (Criteria) this;
        }

        public Criteria andImportanceIsNotNull() {
            addCriterion("importance is not null");
            return (Criteria) this;
        }

        public Criteria andImportanceEqualTo(Integer value) {
            addCriterion("importance =", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceNotEqualTo(Integer value) {
            addCriterion("importance <>", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceGreaterThan(Integer value) {
            addCriterion("importance >", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("importance >=", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceLessThan(Integer value) {
            addCriterion("importance <", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceLessThanOrEqualTo(Integer value) {
            addCriterion("importance <=", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceIn(List<Integer> values) {
            addCriterion("importance in", values, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceNotIn(List<Integer> values) {
            addCriterion("importance not in", values, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceBetween(Integer value1, Integer value2) {
            addCriterion("importance between", value1, value2, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceNotBetween(Integer value1, Integer value2) {
            addCriterion("importance not between", value1, value2, "importance");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Long value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Long value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Long value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Long value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Long value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Long value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Long> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Long> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Long value1, Long value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Long value1, Long value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("create_date like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("create_date not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Long value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Long value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Long value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Long value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Long value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Long value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Long> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Long> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Long value1, Long value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Long value1, Long value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Long value) {
            addCriterion("timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Long value) {
            addCriterion("timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Long value) {
            addCriterion("timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Long value) {
            addCriterion("timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Long value) {
            addCriterion("timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Long value) {
            addCriterion("timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Long> values) {
            addCriterion("timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Long> values) {
            addCriterion("timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Long value1, Long value2) {
            addCriterion("timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Long value1, Long value2) {
            addCriterion("timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andIseffectiveIsNull() {
            addCriterion("isEffective is null");
            return (Criteria) this;
        }

        public Criteria andIseffectiveIsNotNull() {
            addCriterion("isEffective is not null");
            return (Criteria) this;
        }

        public Criteria andIseffectiveEqualTo(Integer value) {
            addCriterion("isEffective =", value, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveNotEqualTo(Integer value) {
            addCriterion("isEffective <>", value, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveGreaterThan(Integer value) {
            addCriterion("isEffective >", value, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("isEffective >=", value, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveLessThan(Integer value) {
            addCriterion("isEffective <", value, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveLessThanOrEqualTo(Integer value) {
            addCriterion("isEffective <=", value, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveIn(List<Integer> values) {
            addCriterion("isEffective in", values, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveNotIn(List<Integer> values) {
            addCriterion("isEffective not in", values, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveBetween(Integer value1, Integer value2) {
            addCriterion("isEffective between", value1, value2, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveNotBetween(Integer value1, Integer value2) {
            addCriterion("isEffective not between", value1, value2, "iseffective");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}