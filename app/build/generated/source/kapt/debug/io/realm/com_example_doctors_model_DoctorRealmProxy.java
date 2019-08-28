package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_example_doctors_model_DoctorRealmProxy extends com.example.doctors.model.Doctor
    implements RealmObjectProxy, com_example_doctors_model_DoctorRealmProxyInterface {

    static final class DoctorColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long nameIndex;
        long addressIndex;
        long photoIdIndex;
        long imageCacheIndex;

        DoctorColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Doctor");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.addressIndex = addColumnDetails("address", "address", objectSchemaInfo);
            this.photoIdIndex = addColumnDetails("photoId", "photoId", objectSchemaInfo);
            this.imageCacheIndex = addColumnDetails("imageCache", "imageCache", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        DoctorColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new DoctorColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final DoctorColumnInfo src = (DoctorColumnInfo) rawSrc;
            final DoctorColumnInfo dst = (DoctorColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.nameIndex = src.nameIndex;
            dst.addressIndex = src.addressIndex;
            dst.photoIdIndex = src.photoIdIndex;
            dst.imageCacheIndex = src.imageCacheIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private DoctorColumnInfo columnInfo;
    private ProxyState<com.example.doctors.model.Doctor> proxyState;

    com_example_doctors_model_DoctorRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (DoctorColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.doctors.model.Doctor>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$address() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.addressIndex);
    }

    @Override
    public void realmSet$address(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.addressIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.addressIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.addressIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.addressIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photoId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photoIdIndex);
    }

    @Override
    public void realmSet$photoId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photoIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photoIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photoIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photoIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$imageCache() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.imageCacheIndex);
    }

    @Override
    public void realmSet$imageCache(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.imageCacheIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.imageCacheIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.imageCacheIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.imageCacheIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Doctor", 5, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("address", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("photoId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("imageCache", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static DoctorColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new DoctorColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Doctor";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Doctor";
    }

    @SuppressWarnings("cast")
    public static com.example.doctors.model.Doctor createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.doctors.model.Doctor obj = null;
        if (update) {
            Table table = realm.getTable(com.example.doctors.model.Doctor.class);
            DoctorColumnInfo columnInfo = (DoctorColumnInfo) realm.getSchema().getColumnInfo(com.example.doctors.model.Doctor.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("id")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.example.doctors.model.Doctor.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_example_doctors_model_DoctorRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_example_doctors_model_DoctorRealmProxy) realm.createObjectInternal(com.example.doctors.model.Doctor.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_example_doctors_model_DoctorRealmProxy) realm.createObjectInternal(com.example.doctors.model.Doctor.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_example_doctors_model_DoctorRealmProxyInterface objProxy = (com_example_doctors_model_DoctorRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("address")) {
            if (json.isNull("address")) {
                objProxy.realmSet$address(null);
            } else {
                objProxy.realmSet$address((String) json.getString("address"));
            }
        }
        if (json.has("photoId")) {
            if (json.isNull("photoId")) {
                objProxy.realmSet$photoId(null);
            } else {
                objProxy.realmSet$photoId((String) json.getString("photoId"));
            }
        }
        if (json.has("imageCache")) {
            if (json.isNull("imageCache")) {
                objProxy.realmSet$imageCache(null);
            } else {
                objProxy.realmSet$imageCache((String) json.getString("imageCache"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.doctors.model.Doctor createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.example.doctors.model.Doctor obj = new com.example.doctors.model.Doctor();
        final com_example_doctors_model_DoctorRealmProxyInterface objProxy = (com_example_doctors_model_DoctorRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("address")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$address((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$address(null);
                }
            } else if (name.equals("photoId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$photoId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$photoId(null);
                }
            } else if (name.equals("imageCache")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$imageCache((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$imageCache(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_example_doctors_model_DoctorRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.example.doctors.model.Doctor.class), false, Collections.<String>emptyList());
        io.realm.com_example_doctors_model_DoctorRealmProxy obj = new io.realm.com_example_doctors_model_DoctorRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.example.doctors.model.Doctor copyOrUpdate(Realm realm, DoctorColumnInfo columnInfo, com.example.doctors.model.Doctor object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.example.doctors.model.Doctor) cachedRealmObject;
        }

        com.example.doctors.model.Doctor realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.example.doctors.model.Doctor.class);
            long pkColumnIndex = columnInfo.idIndex;
            String value = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, value);
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_example_doctors_model_DoctorRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.example.doctors.model.Doctor copy(Realm realm, DoctorColumnInfo columnInfo, com.example.doctors.model.Doctor newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.doctors.model.Doctor) cachedRealmObject;
        }

        com_example_doctors_model_DoctorRealmProxyInterface realmObjectSource = (com_example_doctors_model_DoctorRealmProxyInterface) newObject;

        Table table = realm.getTable(com.example.doctors.model.Doctor.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.addressIndex, realmObjectSource.realmGet$address());
        builder.addString(columnInfo.photoIdIndex, realmObjectSource.realmGet$photoId());
        builder.addString(columnInfo.imageCacheIndex, realmObjectSource.realmGet$imageCache());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_example_doctors_model_DoctorRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.example.doctors.model.Doctor object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.doctors.model.Doctor.class);
        long tableNativePtr = table.getNativePtr();
        DoctorColumnInfo columnInfo = (DoctorColumnInfo) realm.getSchema().getColumnInfo(com.example.doctors.model.Doctor.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$address = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
        }
        String realmGet$photoId = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$photoId();
        if (realmGet$photoId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoIdIndex, rowIndex, realmGet$photoId, false);
        }
        String realmGet$imageCache = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$imageCache();
        if (realmGet$imageCache != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageCacheIndex, rowIndex, realmGet$imageCache, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.doctors.model.Doctor.class);
        long tableNativePtr = table.getNativePtr();
        DoctorColumnInfo columnInfo = (DoctorColumnInfo) realm.getSchema().getColumnInfo(com.example.doctors.model.Doctor.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.doctors.model.Doctor object = null;
        while (objects.hasNext()) {
            object = (com.example.doctors.model.Doctor) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$address = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
            }
            String realmGet$photoId = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$photoId();
            if (realmGet$photoId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoIdIndex, rowIndex, realmGet$photoId, false);
            }
            String realmGet$imageCache = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$imageCache();
            if (realmGet$imageCache != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageCacheIndex, rowIndex, realmGet$imageCache, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.doctors.model.Doctor object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.doctors.model.Doctor.class);
        long tableNativePtr = table.getNativePtr();
        DoctorColumnInfo columnInfo = (DoctorColumnInfo) realm.getSchema().getColumnInfo(com.example.doctors.model.Doctor.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$address = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.addressIndex, rowIndex, false);
        }
        String realmGet$photoId = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$photoId();
        if (realmGet$photoId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoIdIndex, rowIndex, realmGet$photoId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photoIdIndex, rowIndex, false);
        }
        String realmGet$imageCache = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$imageCache();
        if (realmGet$imageCache != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageCacheIndex, rowIndex, realmGet$imageCache, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.imageCacheIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.doctors.model.Doctor.class);
        long tableNativePtr = table.getNativePtr();
        DoctorColumnInfo columnInfo = (DoctorColumnInfo) realm.getSchema().getColumnInfo(com.example.doctors.model.Doctor.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.doctors.model.Doctor object = null;
        while (objects.hasNext()) {
            object = (com.example.doctors.model.Doctor) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$address = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.addressIndex, rowIndex, false);
            }
            String realmGet$photoId = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$photoId();
            if (realmGet$photoId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoIdIndex, rowIndex, realmGet$photoId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photoIdIndex, rowIndex, false);
            }
            String realmGet$imageCache = ((com_example_doctors_model_DoctorRealmProxyInterface) object).realmGet$imageCache();
            if (realmGet$imageCache != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageCacheIndex, rowIndex, realmGet$imageCache, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.imageCacheIndex, rowIndex, false);
            }
        }
    }

    public static com.example.doctors.model.Doctor createDetachedCopy(com.example.doctors.model.Doctor realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.doctors.model.Doctor unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.doctors.model.Doctor();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.doctors.model.Doctor) cachedObject.object;
            }
            unmanagedObject = (com.example.doctors.model.Doctor) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_doctors_model_DoctorRealmProxyInterface unmanagedCopy = (com_example_doctors_model_DoctorRealmProxyInterface) unmanagedObject;
        com_example_doctors_model_DoctorRealmProxyInterface realmSource = (com_example_doctors_model_DoctorRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$address(realmSource.realmGet$address());
        unmanagedCopy.realmSet$photoId(realmSource.realmGet$photoId());
        unmanagedCopy.realmSet$imageCache(realmSource.realmGet$imageCache());

        return unmanagedObject;
    }

    static com.example.doctors.model.Doctor update(Realm realm, DoctorColumnInfo columnInfo, com.example.doctors.model.Doctor realmObject, com.example.doctors.model.Doctor newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_example_doctors_model_DoctorRealmProxyInterface realmObjectTarget = (com_example_doctors_model_DoctorRealmProxyInterface) realmObject;
        com_example_doctors_model_DoctorRealmProxyInterface realmObjectSource = (com_example_doctors_model_DoctorRealmProxyInterface) newObject;
        Table table = realm.getTable(com.example.doctors.model.Doctor.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addString(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.addressIndex, realmObjectSource.realmGet$address());
        builder.addString(columnInfo.photoIdIndex, realmObjectSource.realmGet$photoId());
        builder.addString(columnInfo.imageCacheIndex, realmObjectSource.realmGet$imageCache());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Doctor = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{address:");
        stringBuilder.append(realmGet$address() != null ? realmGet$address() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photoId:");
        stringBuilder.append(realmGet$photoId() != null ? realmGet$photoId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{imageCache:");
        stringBuilder.append(realmGet$imageCache() != null ? realmGet$imageCache() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_example_doctors_model_DoctorRealmProxy aDoctor = (com_example_doctors_model_DoctorRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aDoctor.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aDoctor.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aDoctor.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
