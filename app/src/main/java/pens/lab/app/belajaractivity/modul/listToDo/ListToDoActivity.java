package pens.lab.app.belajaractivity.modul.listToDo;

import android.view.View;

import pens.lab.app.belajaractivity.base.BaseFragmentHolderActivity;


public class ListToDoActivity extends BaseFragmentHolderActivity {
    pens.lab.app.belajaractivity.modul.listToDo.ListToDoFragment listToDoFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        listToDoFragment = new pens.lab.app.belajaractivity.modul.listToDo.ListToDoFragment();
        setCurrentFragment(listToDoFragment, false);

    }



}
