package la.xiong.androidquick.demo.features.module.image.glide;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.OnClick;
import la.xiong.androidquick.demo.R;
import la.xiong.androidquick.demo.base.BaseFragment;
import la.xiong.androidquick.demo.tool.GlideUtils;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class GlideFragment extends BaseFragment {

    public static final String TAG = "GreenDaoFragment";

    @BindView(R.id.btn_glide1)
    Button btn1;

    @BindView(R.id.iv_glide1)
    ImageView imageView1;

    @Override
    protected void initViewsAndEvents(Bundle savedInstanceState) {
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_image_glide;
    }

    @OnClick({R.id.btn_glide1})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_glide1:
                GlideUtils.loadImageView("https://www.baidu.com/img/bd_logo1.png", imageView1);
                break;
        }
    }

}
