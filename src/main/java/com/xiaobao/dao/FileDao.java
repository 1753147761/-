package com.xiaobao.dao;

import com.xiaobao.model.File;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 小暴
 */
@Component("fileDao")
public interface FileDao {
    /**
     * 添加文件直链到数据库
     *
     * @param Api
     * @param FileName
     * @param Url
     * @return
     */
    int addFile(String Api, String FileName, String Url);

    /**
     * 查询API文件列表
     * @param Api
     * @return
     */
    List<File> file(String Api);

    /**
     * 删除API文件
     * @param filename
     * @return
     */
    int delFile(String filename);

    /**
     * 删除API所有文件
     * @param Api
     * @return
     */
    int AllDelFile(String Api);

    /**
     * 查询API是否存在该文件
     *
     * @param Api
     * @param filename
     * @return
     */
    Integer filename(String Api, String filename);
}
