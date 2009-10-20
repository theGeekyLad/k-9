
package com.android.email;

import android.content.Context;

import com.android.email.mail.Folder;
import com.android.email.mail.Message;
import com.android.email.mail.Part;

/**
 * Defines the interface that MessagingController will use to callback to requesters. This class
 * is defined as non-abstract so that someone who wants to receive only a few messages can
 * do so without implementing the entire interface. It is highly recommended that users of
 * this interface use the @Override annotation in their implementations to avoid being caught by
 * changes in this class.
 */
public class MessagingListener {

    public void accountStatusChanged(Account account, int unreadMessageCount) {
    }
    
    public void accountSizeChanged(Account account, long oldSize, long newSize)
    {
    }
    
    public void accountReset(Account account) {
      
    }
  
    public void listFoldersStarted(Account account) {
    }

    public void listFolders(Account account, Folder[] folders) {
    }

    public void listFoldersFailed(Account account, String message) {
    }

    public void listFoldersFinished(Account account) {
    }

    public void listLocalMessagesStarted(Account account, String folder) {
    }

    public void listLocalMessages(Account account, String folder, Message[] messages) {
    }
    
    public void listLocalMessagesAddMessage(Account account, String folder, Message message) {
    }

    public void listLocalMessagesUpdateMessage(Account account, String folder, Message message) {
    }

    public void listLocalMessagesRemoveMessage(Account account, String folder, Message message) {
    }

    public void listLocalMessagesFailed(Account account, String folder, String message) {
    }

    public void listLocalMessagesFinished(Account account, String folder) {
    }

    public void synchronizeMailboxStarted(Account account, String folder) {
    }

    public void synchronizeMailboxNewMessage(Context context, Account account, String folder, Message message) {
    }

    public void synchronizeMailboxAddOrUpdateMessage(Account account, String folder, Message message) {
    }

    public void synchronizeMailboxRemovedMessage(Account account, String folder,Message message) {
    }

    public void synchronizeMailboxFinished(Account account, String folder,
            int totalMessagesInMailbox, int numNewMessages) {
    }

    public void synchronizeMailboxFailed(Account account, String folder,
            String message) {
    }

    public void loadMessageForViewStarted(Account account, String folder, String uid) {
    }

    public void loadMessageForViewHeadersAvailable(Account account, String folder, String uid,
            Message message) {
    }

    public void loadMessageForViewBodyAvailable(Account account, String folder, String uid,
            Message message) {
    }

    public void loadMessageForViewFinished(Account account, String folder, String uid,
            Message message) {
    }

    public void loadMessageForViewFailed(Account account, String folder, String uid, Throwable t) {
    }

    public void checkMailStarted(Context context, Account account) {
    }

    public void checkMailFinished(Context context, Account account) {
    }
    
    public void checkMailFailed(Context context, Account account, String reason) {
    }

    public void sendPendingMessagesStarted(Account account) {
    }

    public void sendPendingMessagesCompleted(Account account) {
    }
    
    public void sendPendingMessagesFailed(Account account) {
    }

    public void messageDeleted(Account account, String folder, Message message)
    {
      
    }
    public void emptyTrashCompleted(Account account) {
    }

    public void folderStatusChanged(Account account, String folderName) {
    }

    public void messageUidChanged(Account account, String folder, String oldUid, String newUid) {

    }

    public void loadAttachmentStarted(
            Account account,
            Message message,
            Part part,
            Object tag,
            boolean requiresDownload)
    {
    }

    public void loadAttachmentFinished(
            Account account,
            Message message,
            Part part,
            Object tag)
    {
    }

    public void loadAttachmentFailed(
            Account account,
            Message message,
            Part part,
            Object tag,
            String reason)
    {
    }

    /**
     * General notification messages subclasses can override to be notified that the controller
     * has completed a command. This is useful for turning off progress indicators that may have
     * been left over from previous commands.
     * @param moreCommandsToRun True if the controller will continue on to another command
     * immediately.
     */
    public void controllerCommandCompleted(boolean moreCommandsToRun) {

    }
}
