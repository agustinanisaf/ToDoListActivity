package pens.lab.app.belajaractivity.modul.listToDo;

import pens.lab.app.belajaractivity.base.BasePresenter;
import pens.lab.app.belajaractivity.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface ListToDoContract {
    interface View extends BaseView<Presenter> {
        void redirectToAdd();
    }

    interface Presenter extends BasePresenter {
        void performAdd(String title);
    }
}
