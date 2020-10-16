package pens.lab.app.belajaractivity.modul.listToDo;

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
import pens.lab.app.belajaractivity.modul.add.AddActivity;


/**
 * Created by fahrul on 13/03/19.
 */

public class ListToDoFragment extends BaseFragment<ListToDoActivity, ListToDoContract.Presenter> implements ListToDoContract.View {

    TextView Title;
    TextView description;
    EditText addNew;
    Button btnAdd;
    Button btnEdit;
    Button btnDelete;
    String title;


    public ListToDoFragment() {
    }

    @Nullable
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_list, container, false);
        mPresenter = new ListToDoPresenter(this);
        mPresenter.start();

        addNew = fragmentView.findViewById(R.id.addNewTask);
        Title = fragmentView.findViewById(R.id.task1);
        description = fragmentView.findViewById(R.id.description1);
        btnAdd = fragmentView.findViewById(R.id.bt_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBtAddClick();
            }
        });
        btnEdit = fragmentView.findViewById(R.id.bt_edit);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBtEditClick();
            }
        });
        btnDelete = fragmentView.findViewById(R.id.bt_delete);
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBtDeleteClick();
            }
        });

        setTitle("List To Do View");

        return fragmentView;
    }

    public void setBtAddClick(){
        title = addNew.getText().toString();
        mPresenter.performAdd(title);
    }

    public void setBtEditClick(){

    }

    public void setBtDeleteClick(){

    }

    @Override
    public void setPresenter(ListToDoContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void redirectToAdd() {
            Intent intent = new Intent(activity, AddActivity.class);
            intent.putExtra("title", title);
            startActivity(intent);
            activity.finish();
    }


}
