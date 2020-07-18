import { TestBed, inject } from '@angular/core/testing';

import { ComplaintService } from './complaint.service';

describe('ComplaintService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ComplaintService]
    });
  });

  it('should be created', inject([ComplaintService], (service: ComplaintService) => {
    expect(service).toBeTruthy();
  }));
});
