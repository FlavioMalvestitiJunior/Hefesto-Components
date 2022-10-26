package com.hefesto.hefestocomponentes.HFTreeTable;

import java.util.List;

public class HFRowData {

    private List<Object> data;
    private boolean isCanAdd;

    public HFRowData(List<Object> data, boolean isCanAdd) {
        this.data = data;
        this.isCanAdd = isCanAdd;
    }

    /**
     * @return the client
     */
    public boolean isCanAdd() {
        return isCanAdd;
    }

    /**
     * @param isRoot the isRoot to set
     */
    public void setRoot(boolean isCanAdd) {
        this.isCanAdd = isCanAdd;
    }

    public Object getData(int i) {
        if (i > data.size() - 1) {
            return "";
        }
        return data.get(i) != null ? data.get(i) : "";
    }
}
