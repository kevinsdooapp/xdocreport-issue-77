/*
 * Copyright (c) 2013, dooApp <contact@dooapp.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name of dooApp nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import fr.opensagres.xdocreport.document.images.IImageProvider;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * <p>
 * User: Kevin Senechal <kevin@dooapp.com>
 * Date: 30/09/2015
 * Time: 17:13
 */
public class Contact {
    private String name = "";

    private ListProperty<Object> documents = new SimpleListProperty(FXCollections.observableArrayList());

    private ObjectProperty<Address> address = new SimpleObjectProperty();

    private ObjectProperty<IImageProvider> image = new SimpleObjectProperty();

    private StringProperty mail = new SimpleStringProperty();

    private StringProperty phone = new SimpleStringProperty();

    private StringProperty mobile = new SimpleStringProperty();

    private StringProperty website = new SimpleStringProperty();

    private StringProperty legal = new SimpleStringProperty();

    private ObjectProperty<Object> role = new SimpleObjectProperty();

    private ObjectProperty<IImageProvider> signature = new SimpleObjectProperty();

    public String getName() {
        return name;
    }

    public ObservableList<Object> getDocuments() {
        return documents.get();
    }

    public ListProperty<Object> documentsProperty() {
        return documents;
    }

    public void setDocuments(ObservableList<Object> documents) {
        this.documents.set(documents);
    }

    public Address getAddress() {
        return address.get();
    }

    public ObjectProperty<Address> addressProperty() {
        return address;
    }

    public void setAddress(Address address) {
        this.address.set(address);
    }

    public IImageProvider getImage() {
        return image.get();
    }

    public ObjectProperty<IImageProvider> imageProperty() {
        return image;
    }

    public void setImage(IImageProvider image) {
        this.image.set(image);
    }

    public String getMail() {
        return mail.get();
    }

    public StringProperty mailProperty() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail.set(mail);
    }

    public String getPhone() {
        return phone.get();
    }

    public StringProperty phoneProperty() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone.set(phone);
    }

    public String getMobile() {
        return mobile.get();
    }

    public StringProperty mobileProperty() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile.set(mobile);
    }

    public String getWebsite() {
        return website.get();
    }

    public StringProperty websiteProperty() {
        return website;
    }

    public void setWebsite(String website) {
        this.website.set(website);
    }

    public String getLegal() {
        return legal.get();
    }

    public StringProperty legalProperty() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal.set(legal);
    }

    public Object getRole() {
        return role.get();
    }

    public ObjectProperty<Object> roleProperty() {
        return role;
    }

    public void setRole(Object role) {
        this.role.set(role);
    }

    public IImageProvider getSignature() {
        return signature.get();
    }

    public ObjectProperty<IImageProvider> signatureProperty() {
        return signature;
    }

    public void setSignature(IImageProvider signature) {
        this.signature.set(signature);
    }
}
