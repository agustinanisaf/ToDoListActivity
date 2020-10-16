package pens.lab.app.belajaractivity.modul.add;

import android.view.View;

import pens.lab.app.belajaractivity.base.BaseFragmentHolderActivity;


public class AddActivity extends BaseFragmentHolderActivity {
    pens.lab.app.belajaractivity.modul.add.AddFragment addFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        addFragment = new pens.lab.app.belajaractivity.modul.add.AddFragment(getIntent().getExtras());
        setCurrentFragment(addFragment, false);

    }



}
