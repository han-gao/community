package xyz.hangao.community.community.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import xyz.hangao.community.community.model.Comment;
import xyz.hangao.community.community.model.CommentExample;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 15 14:55:32 GMT+08:00 2019
     */
    long countByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 15 14:55:32 GMT+08:00 2019
     */
    int deleteByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 15 14:55:32 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 15 14:55:32 GMT+08:00 2019
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 15 14:55:32 GMT+08:00 2019
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 15 14:55:32 GMT+08:00 2019
     */
    List<Comment> selectByExampleWithRowbounds(CommentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 15 14:55:32 GMT+08:00 2019
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 15 14:55:32 GMT+08:00 2019
     */
    Comment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 15 14:55:32 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 15 14:55:32 GMT+08:00 2019
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 15 14:55:32 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Tue Oct 15 14:55:32 GMT+08:00 2019
     */
    int updateByPrimaryKey(Comment record);
}