package pens.lab.app.belajaractivity.modul.add;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BaseFragment;
import pens.lab.app.belajaractivity.modul.profile.ProfileActivity;


/**
 * Created by fahrul on 13/03/19.
 */

public class AddFragment extends BaseFragment<pens.lab.app.belajaractivity.modul.add.AddActivity, pens.lab.app.belajaractivity.modul.add.AddContract.Presenter> implements pens.lab.app.belajaractivity.modul.add.AddContract.View {

    EditText Title;
    EditText Description;
    Button btnSave;
    Button btnCancel;
    Bundle bundle;
    String title;
    String description;

    public AddFragment(Bundle extras) {
        this.bundle = extras;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_add, container, false);
        mPresenter = new pens.lab.app.belajaractivity.modul.add.AddPresenter(this);
        mPresenter.start();

        Title = fragmentView.findViewById(R.id.title_task);
        Description = fragmentView.findViewById(R.id.description);
        btnSave = fragmentView.findViewById(R.id.bt_add);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBtnSaveClick();
            }
        });
        btnCancel = fragmentView.findViewById(R.id.bt_cancel);
        title = bundle.getString("title");
        description = bundle.getString("description");

        redirectAdd();
        setTitle("Add New Task");

        return fragmentView;
    }

    @Override
    public void setPresenter(pens.lab.app.belajaractivity.modul.add.AddContract.Presenter presenter) {
        mPresenter = presenter;
    }

    public void setBtnSaveClick() {
        title = Title.getText().toString();
        description = Description.getText().toString();
        mPresenter.performList(title,description);
    }

    public void redirectAdd() {
        Title.setText(title);
        Intent intent = new Intent(activity, ProfileActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        startActivity(intent);
        activity.finish();
    }

}
