/****************************************************************************
 * Copyright 2014 studio Aspix 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 ***************************************************************************/
package it.aspix.tabparser.tabella;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

/****************************************************************************
 * Il rendering dell'intestazione: una etichetta con un testo
 * 
 * @author Edoardo Panfili, studio Aspix
 ***************************************************************************/
public class HeaderColonnaRenderer extends JLabel implements TableCellRenderer {

	private static final long serialVersionUID = 1L;
	
	public HeaderColonnaRenderer() {
		super();
		setOpaque(true); 
		setHorizontalAlignment(SwingConstants.CENTER);
	}

	public Component getTableCellRendererComponent(JTable table, Object object, boolean isSelected, boolean hasFocus, int row, int column) {
		if(object!=null){
			String testo = ((HeaderColonna)object).getValore();
			if(object.equals(HeaderColonna.NON_USARE)){
				this.setBackground(Costanti.COLORE_HEADER_NON_USARE);
			}else{
				this.setBackground(Costanti.COLORE_HEADER);
			}
			this.setText(testo);
		}
		if (isSelected) {
			setBorder(Costanti.bordoSelezionato);
		} else {
			setBorder(Costanti.bordoNonSelezionato);
		}
		return this;
	}
}