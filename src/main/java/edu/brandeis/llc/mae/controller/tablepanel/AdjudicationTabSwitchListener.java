/*
 * MAE - Multi-purpose Annotation Environment
 *
 * Copyright Keigh Rim (krim@brandeis.edu)
 * Department of Computer Science, Brandeis University
 * Original program by Amber Stubbs (astubbs@cs.brandeis.edu)
 *
 * MAE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, @see <a href="http://www.gnu.org/licenses">http://www.gnu.org/licenses</a>.
 *
 * For feedback, reporting bugs, use the project on Github
 * @see <a href="https://github.com/keighrim/mae-annotation">https://github.com/keighrim/mae-annotation</a>.
 */

package edu.brandeis.llc.mae.controller.tablepanel;

import edu.brandeis.llc.mae.database.MaeDBException;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Created by krim on 1/11/2017.
 */
class AdjudicationTabSwitchListener implements ChangeListener {
    private TablePanelController tablePanelController;

    public AdjudicationTabSwitchListener(TablePanelController tablePanelController) {
        this.tablePanelController = tablePanelController;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        try {
            tablePanelController.getMainController().switchAdjudicationTag();
        } catch (MaeDBException ex) {
            tablePanelController.getMainController().showError(ex);
        }

    }
}
