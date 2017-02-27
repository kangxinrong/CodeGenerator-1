package cn.makisekurisu.codeGenerator.config;

import cn.makisekurisu.codeGenerator.bean.codeFile.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ym on 2017/2/23 0023.
 *
 * 默认生成的一些类
 */
public class DefaultGeneratedClasses {

    public final BeanUtilFileInfo beanUtilFileInfo = new BeanUtilFileInfo();

    public final SqlUtilFileInfo sqlUtilFileInfo = new SqlUtilFileInfo();

    public final DateUtilFileInfo dateUtilFileInfo = new DateUtilFileInfo();

    public final StringUtilFileInfo stringUtilFileInfo = new StringUtilFileInfo();

    public final List<CodeFileInfo> utilClasses = new ArrayList<CodeFileInfo>();

    public DefaultGeneratedClasses() {
        initUitlClasses();
    }

    private void initUitlClasses() {
        utilClasses.add(beanUtilFileInfo);
        utilClasses.add(sqlUtilFileInfo);
        utilClasses.add(dateUtilFileInfo);
        utilClasses.add(stringUtilFileInfo);
    }
}
