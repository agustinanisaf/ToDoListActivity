package pens.lab.app.belajaractivity.modul.edit;

import pens.lab.app.belajaractivity.base.BasePresenter;
import pens.lab.app.belajaractivity.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface EditContract {
    interface View extends BaseView<Presenter> {
        void redirectEdit();
    }

    interface Presenter extends BasePresenter {
        void performList(String title, String description);
    }
}
