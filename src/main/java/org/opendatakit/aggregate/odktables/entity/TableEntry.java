package org.opendatakit.aggregate.odktables.entity;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Root;

@Root
@Default(value = DefaultType.FIELD, required = false)
public class TableEntry {

  private String tableId;
  private String dataEtag;

  public TableEntry() {
  }

  public TableEntry(final String tableId, final String dataEtag) {
    this.tableId = tableId;
    this.dataEtag = dataEtag;
  }

  public String getTableId() {
    return this.tableId;
  }

  public String getDataEtag() {
    return this.dataEtag;
  }

  public void setTableId(final String tableId) {
    this.tableId = tableId;
  }

  public void setDataEtag(final String dataEtag) {
    this.dataEtag = dataEtag;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (!(obj instanceof TableEntry))
      return false;
    TableEntry other = (TableEntry) obj;
    if (dataEtag == null) {
      if (other.dataEtag != null)
        return false;
    } else if (!dataEtag.equals(other.dataEtag))
      return false;
    if (tableId == null) {
      if (other.tableId != null)
        return false;
    } else if (!tableId.equals(other.tableId))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((dataEtag == null) ? 0 : dataEtag.hashCode());
    result = prime * result + ((tableId == null) ? 0 : tableId.hashCode());
    return result;
  }

  public String toString() {
    return "TableEntry(tableId=" + this.getTableId() + ", dataEtag=" + this.getDataEtag() + ")";
  }
}