package pens.lab.app.belajaractivity.modul.edit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BaseFragment;


/**
 * Created by fahrul on 13/03/19.
 */

public class EditFragment extends BaseFragment<EditActivity, EditContract.Presenter> implements EditContract.View {

    TextView Title;
    TextView Description;
    Button btnSave;
    Button btnCancel;
    Bundle bundle;
    String title;
    String description;

    public EditFragment(Bundle extras) {
        this.bundle = extras;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_edit, container, false);
        mPresenter = new EditPresenter(this);
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
        title = bundle.getString("title");

        redirectAdd();
        setTitle("Add New Task");

        return fragmentView;
    }

    @Override
    public void setPresenter(EditContract.Presenter presenter) {
        mPresenter = presenter;
    }


    public void redirectAdd() {
        Title.setText(title);
    }

    public void setBtnSaveClick() {
        title = Title.getText().toString();
        description = Description.getText().toString();
        mPresenter.performList(title,description);
    }
}
